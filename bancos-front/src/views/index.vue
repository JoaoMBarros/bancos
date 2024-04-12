<template>
  </template>
  
<script>
import Bancos from '../components/Bancos.vue'

export default {
    name: 'index',

    // Redireciona para a página de bancos
    mounted(){
        this.$router.push('/bancos')
    }
}
</script>