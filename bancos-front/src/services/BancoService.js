import axios from 'axios';

const BANCO_API_BASE_URL = 'http://localhost:8080/api/bancos';

class BancoService{

    // Método para buscar todos os bancos
    getBancos(){
        return axios.get(BANCO_API_BASE_URL);
    }

    // Método para buscar um banco específico
    getBancoById(bancoId){
        return axios.get(BANCO_API_BASE_URL + '/' + bancoId);
    }
}

export default new BancoService();