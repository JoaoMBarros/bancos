<template>
    <div class = "container">
        <h1>Lista de instituições</h1>
            <table>
                <thead>
                    <tr>
                        <th>Código de compensação</th>
                        <th>Nome da instituição</th>
                    </tr>
                </thead>
                <tbody>
                    <tr v-for="banco in bancos">
                        <td id="codigo">{{banco.codigo}}</td>
                        <td id="nome"><a :href="`bancos/` + banco.codigo"><span>{{ banco.nome }}</span></a></td>
                    </tr>
                </tbody>
            </table>
        </div>
</template>

<script>

import BancoService from '../services/BancoService';

export default {
    name: 'Bancos',
    data(){
        return {
            bancos: []
        }
    },
    methods: {

        // Chama a função do service que busca todos os bancos
        getBancos(){
            BancoService.getBancos().then((response) => {
                this.bancos = response.data;
            });
        }
    },
    created() {
        this.getBancos();
    }
}

</script>

<style>

.container {
    display: flex;
    flex-direction: column;
    align-items: center;
}

h1 {
    margin-left: 7%;
}

th {
    text-align: right;
    padding: 8px;
}

#codigo {
    text-align: center;
    padding: 8px;

}

#nome {
    text-align: right;
    padding: 8px;
}


a:hover {
    background-color:transparent !important;
    text-decoration: underline;
}

</style>