import axios from 'axios'

const ORDER_API = 'http://localhost:8080/order/'

class OrderService {
    getOrders() {
        return axios.get(ORDER_API + 'all');
    }

    updateOrderStatus(id, orderStatus) {
       return axios.post(ORDER_API + 'update-status/' + id+'/'+ orderStatus,{}); 
    }
}

export default new OrderService()