<template>
    <div class = "container">
        <h1>Instituição</h1>
            <!-- v-if que verifica se dados válidos foram retornados da api -->
            <table v-if="banco">
                <thead>
                    <tr>
                        <th>Código de compensação</th>
                        <th>Nome da instituição</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td id="codigo">{{banco.codigo}}</td>
                        <td id="nome">{{ banco.nome }}</td>
                    </tr>
                </tbody>
            </table>
            <div v-else>
                <h2>Dados não encontrados.</h2>
            </div>
        </div>
</template>


<script>

import BancoService from '../services/BancoService';

export default {
name: 'BancoEspecifoco',
data(){
    return {
        banco: null
    }
},
methods: {

    // Chama a função do service que busca o banco utilizando o id passado pela rota
    getBanco(){
        BancoService.getBancoById(this.$route.params.id).then((response) => {
            this.banco = response.data;
        });
    }
    },

    // Quando a página é criada, chama o método getBanco
    created() {
        this.getBanco();
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
    margin-left: 6%;
}

h1 {
    margin-left: 1%;
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
</style>