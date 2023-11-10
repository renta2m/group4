<template>
  <div class="container mt-5">
    <h2 class="text-center mb-4 text-light">Login</h2>
    
    <div class="row justify-content-center">
      <div class="col-md-6">
        <div class="card gold-background">
          <form @submit.prevent="submitLogin" class="p-3">
            <div class="mb-3">
              <label for="username" class="form-label text-dark">Email</label>
              <input type="text" class="form-control" id="username" v-model="username" required>
            </div>

            <div class="mb-3">
              <label for="password" class="form-label text-dark">Password</label>
              <input type="password" class="form-control" id="password" v-model="password" required>
            </div>

            <fieldset class="mb-3">
              
              <div class="form-check">
                <div class="row">
                  <div class="col-auto">
                    <input class="form-check-input" type="radio" name="gridRadios" id="student" v-model="designation" value="student" checked>
                  </div>
                  <div class="col-auto">
                    <label class="form-check-label text-dark" for="student">Student</label>
                  </div>
                </div>
              </div>
              <div class="form-check">
                <div class="row">
                  <div class="col-auto">
                    <input class="form-check-input" type="radio" name="gridRadios" id="employee" v-model="designation" value="employee">
                  </div>
                  <div class="col-auto">
                    <label class="form-check-label text-dark" for="employee">Employee</label>
                  </div>
                </div>
              </div>
            </fieldset>

            <button type="submit" class="btn btn-primary" v-on:click="submitLogin()">Sign in</button>
          </form>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import LoginService from '../services/LoginService'; // Adjust the path based on your project structure

export default {
  data() {
    return {
      username: '',
      password: '',
      designation:'',
    };
  },
  methods: {
    submitLogin() {
      const credentials = {
        userName: this.username,
        password: this.password,
        designation: this.designation,
      };

      LoginService.login(credentials)
        .then(response => {
          // Handle successful login (e.g., store authentication token)
        
          console.log('Login successful', response.data);
          this.$router.push("/menu-items").catch(()=>{});
                })
        .catch(error => {
          // Handle login error
          console.error('Error during login:', error);
        });
        //this.$router.push('/menu-items');
    },
  },
};
</script>

<style >
body {
  background-color: maroon;
  margin: 0;
  padding: 0;
}

.card.gold-background {
  background-color: gold;
  color: black; /* Set the text color to ensure readability */
}
</style>
