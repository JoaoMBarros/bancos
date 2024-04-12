import { createRouter, createWebHistory } from 'vue-router'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: () => import('../views/index.vue')
    },

    // Rota para exibir todos os bancos
    {
      path: '/bancos/',
      name: 'Bancos',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import('../views/BancosView.vue')
    },

    // Rota para exibir um banco específico
    {
      path: '/bancos/:id',
      name: 'Banco',
      component: () => import('../views/BancoEspecificoView.vue')
    }
  ]
})

export default router
