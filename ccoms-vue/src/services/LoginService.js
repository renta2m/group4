import axios from 'axios';

const LOGIN_API = 'http://localhost:8080/login'; 

class LoginService {
  login(credentials) {
    return axios.post(LOGIN_API, credentials);
  }

}

export default new LoginService();
