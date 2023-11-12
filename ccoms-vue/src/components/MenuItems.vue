<template>
  <div class="container">
    <h2 class="mt-5 mb-4 text-center">Menu</h2>
    <div class="row">
      <div class="col-md-4" v-for="(menuItem, index) in menuItems" :key="index">
        <div class="card mb-4">
          <!-- <img :src="menuItem.image" class="card-img-top" alt="menu Item Image"> -->
          <div class="card-body">
            <h5 class="card-title">{{ menuItem.itemName }}</h5>
            <p class="card-text">{{ menuItem.diningStation }}</p>
            <p class="card-text"><strong>$ {{ menuItem.price }}</strong></p>
          </div>
          <div class="card-footer">
            <button class="btn btn-primary btn-block">Add to Cart</button>
            
          </div>
        </div>
      </div>
    </div>

  </div>
</template>

<script>
import MenuService from '../services/MenuService';
export default {
  name: 'MenuItems',
  data() {
    return {
      menuItems: []
    }
  },
  methods: {
    getMenuItems() {
      MenuService.getMenuItems().then((response) => {
        this.menuItems = response.data
      })
    }
  },
  created() {
    this.getMenuItems()
  }
};
</script>

<style>
/* Add custom styling here if needed */
.card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  transition: 0.3s;
}

.card:hover {
  box-shadow: 0 8px 16px 0 rgba(0, 0, 0, 0.2);
}

.card-title {
  font-size: 1.25rem;
  font-weight: 600;
}

.card-text {
  font-size: 0.875rem;
}

.card-footer {
  background-color: #f7f7f7;
}

.btn {
  background-color: maroon;
  color: #fff;
  border: none;
}

.btn:hover {
  background-color: rgb(152, 1, 1);
}
</style>