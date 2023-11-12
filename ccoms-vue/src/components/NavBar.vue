<template>
  <div>
    <nav class="navbar navbar-expand-lg navbar-light bg-gold">
      <div class="container">
        <router-link to="/">
          <!-- Replace 'path-to-your-logo.png' with the actual path to your logo image -->
          <img src="../assets/cmu.png" alt="Logo" class="navbar-brand-logo">
        </router-link>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
          aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse justify-content-between" id="navbarNav">
          <div>
            <ul class="navbar-nav ml-auto">
              <li class="nav-item">
                <router-link to="/login"
                  class="nav-link text-dark">Home</router-link>
              </li>
              <li class="nav-item" >
                <router-link to="/menu-items" class="nav-link text-dark">Menu</router-link>
              </li>
              <li class="nav-item">
                <router-link to="/orders" class="nav-link text-dark">Orders</router-link>
              </li>
              <li class="nav-item">
                <router-link to="/contact" class="nav-link text-dark">Contact</router-link>
              </li>
            </ul>
          </div>
          <div>
            <button class="btn btn-primary" v-on:click="logout()">Log Out</button>
          </div>
        </div>
      </div>
    </nav>
  </div>
</template>
<script>
export default {
  methods: {
    logout() {
      sessionStorage.clear();
      this.$router.push('/login');
    },
  }
};
</script>
<style scoped>
.bg-gold {
  background-color: gold !important;
}

/* Adjust the max-height and max-width as needed to fit your design */
.navbar-brand-logo {
  max-height: 40px;
  max-width: 100%;
}
</style>
