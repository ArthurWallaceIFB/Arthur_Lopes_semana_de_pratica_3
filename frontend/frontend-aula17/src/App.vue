<template>
  <div id="app" class="container-fluid">
    <div class="header">
      <img
        src="https://site.ieee.org/sb-ifb/files/2019/01/IFB-1024x357.png"
        alt="logo IFB"
        class="logo"
      />
      <span class="titulo"> Semana Prática 3 </span>
      <span class="sub-titulo">Aluno: Arthur Wallace Silva Lopes</span>
    </div>
    <nav class="nav">
      <router-link class="menu-item" to="/">Clientes</router-link>
      <router-link class="menu-item" to="/add">Inserir</router-link>
      <router-link class="menu-item" to="/pesquisar">Pesquisar</router-link
      >
    </nav>
    <br />
    <router-view class="content" />
  </div>
</template>
<script>
export default {
  name: "app",
};
</script>
<style>
.header {
  background: #ececec;
  color: rgb(41, 41, 41);
  width: 100%;
  height: 5rem;
  position: fixed;
  top: 0;
  left: 0;
  margin-bottom: 3rem;
  -webkit-box-shadow: 0px 4px 11px -3px rgba(59, 59, 59, 0.48);
  box-shadow: 0px 4px 11px -3px rgba(59, 59, 59, 0.48);
}
.header .logo {
  height: 70%;
  display: flex;
  margin-top: 0.5rem;
  margin-left: 1rem;
  float: left;
  position: absolute;
}
.header .titulo {
  font-weight: 700;
  font-size: 1.8rem;
  text-align: center;
  margin-top: 1rem;
  display: block;
}
.header .sub-titulo {
  font-weight: 500;
}
.nav {
  margin-top: 5rem;
  padding: 1rem 0;
  border-bottom: 1px solid rgb(82, 82, 82);
  position: fixed;
  width: 100%;
  text-align: center;

}
.menu-item {
  padding: 1rem;
  text-decoration: none;
  font-weight: 700;
  font-size: 1rem;
  color: #333;
  margin-right: 1rem;
  margin-left: 1rem;
  border-radius: 1rem;
}

.btn{
  padding: 1rem 3rem;
  width: 40%;
  border-radius: 2rem;
  font-weight: 600;
  border: 1px solid black;
  background: #e9e9e9;
  font-size: 1rem;
}

.btn-success{
  background: #5cb85c !important;
  color: #fff;
  border-color: #4ea14e;
}

.btn-primary {
  background: #337ab7 !important;
  color: #fff !important;
  border-color: #245a8a !important;
}

.btn-danger {
  background: #d9534f !important;
  color: #fff !important;
  border-color: #aa3f3c !important;
}


.content{
  margin-top: 12rem !important;
}
.container-fluid {
  text-align: center;
}
input{
  border-radius: 1rem;
  padding: 0.5rem;
  margin-bottom: 1rem;
  margin-left: 1.5rem;
  border: 0.5px solid rgb(49, 49, 49);
  width: 50%;
}
</style>