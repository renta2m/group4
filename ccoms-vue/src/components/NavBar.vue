<template>
  <div>
    <nav class="navbar navbar-expand-lg navbar-light bg-gold">
      <div class="container">
        <router-link to="/">
          <!-- Replace 'path-to-your-logo.png' with the actual path to your logo image -->
          <img src="../assets/cmu.png" alt="Logo" class="navbar-brand-logo">
        </router-link>
        <button
          class="navbar-toggler"
          type="button"
          data-toggle="collapse"
          data-target="#navbarNav"
          aria-controls="navbarNav"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item">
              <router-link to="/login" class="nav-link text-dark">Home</router-link>
            </li>
            <li class="nav-item">
              <router-link to="/menu" class="nav-link text-dark">Products</router-link>
            </li>
            <li class="nav-item">
              <router-link to="/about" class="nav-link text-dark">About</router-link>
            </li>
            <li class="nav-item">
              <router-link to="/contact" class="nav-link text-dark">Contact</router-link>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  </div>
</template>

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
