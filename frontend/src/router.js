import Vue from 'vue'
import Router from 'vue-router'
// 导入刚才编写的组件
import AppIndex from './components/home/AppIndex'
import NotFound from './components/home/NotFound'
import Login from './components/Login'

Vue.use(Router)

export default new Router({
    mode : 'history',
    routes: [
        {
            path: '/login',
            name: 'Login',
            component: Login
        },
        {
            path: '/index',
            name: 'AppIndex',
            component: AppIndex
        },{
            path: '/404',
            name: 'NotFound',
            component: NotFound
        },
        {
            path:'/',
            redirect:'/login'
        }
    ]
})


