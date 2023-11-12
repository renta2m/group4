import axios from 'axios'

const ORDER_API = 'http://localhost:8080/order/'

class OrderService {
    getOrders() {
        return axios.get(ORDER_API + 'all');
    }
}

export default new OrderService()