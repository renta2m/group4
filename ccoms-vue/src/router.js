import Vue from 'vue'
import VueRouter from 'vue-router'
import LoginPage from './components/LoginPage'
import MenuItems from './components/MenuItems'

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
  }
]

const router = new VueRouter({
    mode: 'history',
    routes
  });

export default router;