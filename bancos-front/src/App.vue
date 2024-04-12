<template>
  <div id="app">
    <router-view/>
  </div>
</template>

<script>

export default {
  name: 'App',
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  display: flex;
  margin-top: 2%;
}

a {
    color: white;
    text-decoration: none;
    font-size: 16px;
    cursor: pointer;
}
</style>