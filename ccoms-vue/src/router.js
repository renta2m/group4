import Vue from 'vue'
import VueRouter from 'vue-router'
import LoginPage from './components/LoginPage'
import MenuItems from './components/MenuItems'
import OrderList from './components/OrderList'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    component: LoginPage
  },
  {
    path: '/login',
    component: LoginPage
  },
  {
    path: '/menu-items',
    component: MenuItems
  },
  {
    path: '/orders',
    component: OrderList
  }
]

const router = new VueRouter({
    mode: 'history',
    routes
  });

export default router;