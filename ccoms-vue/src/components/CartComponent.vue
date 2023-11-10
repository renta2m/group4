<template>
    <div>
      <h2>Your Cart</h2>
      <ul>
        <li v-for="(cartItem, index) in cartItems" :key="index">
          {{ cartItem.item.name }} - ${{ cartItem.item.price }} - Quantity: {{ cartItem.quantity }}
          <div class="btn-group btn-group-sm ml-2" role="group">
            <button @click="updateQuantity(index, 'decrease')" class="btn btn-secondary">-</button>
            <button @click="updateQuantity(index, 'increase')" class="btn btn-secondary">+</button>
          </div>
          <button @click="removeFromCart(index)" class="btn btn-sm btn-danger ml-2">Remove</button>
        </li>
      </ul>
      <p>Total: ${{ getTotal() }}</p>
    </div>
  </template>
  
  <script>
  export default {
    data() {
      return {
        cartItems: [],
      };
    },
    methods: {
      addToCart(item) {
        const existingItem = this.cartItems.find((cartItem) => cartItem.item.id === item.id);
  
        if (existingItem) {
          existingItem.quantity++;
        } else {
          this.cartItems.push({ item, quantity: 1 });
        }
      },
      removeFromCart(index) {
        this.cartItems.splice(index, 1);
      },
      updateQuantity(index, action) {
        const cartItem = this.cartItems[index];
  
        if (action === 'increase') {
          cartItem.quantity++;
        } else if (action === 'decrease') {
          if (cartItem.quantity > 1) {
            cartItem.quantity--;
          }
        }
      },
      getTotal() {
        return this.cartItems.reduce((total, cartItem) => total + cartItem.item.price * cartItem.quantity, 0).toFixed(2);
      },
    },
  };
  </script>
  
  <style scoped>
  /* Add custom styling here if needed */
  </style>
  