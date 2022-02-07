<template>
  <div class="list row">
    <div class="col-md-6">
      <span class="titulo-lista">Lista de Clientes</span>
      <ul>
        <li v-for="(cliente, index) in clientes" :key="index">
          <router-link
            :to="{
              name: 'cliente-detalhes',
              params: { cliente: cliente, id: cliente.id },
            }"
          >
            {{ cliente.nome }}
          </router-link>
        </li>
      </ul>
    </div>
    <div class="col-md-6">
      <router-view @refreshData="refreshList"></router-view>
    </div>
  </div>
</template>
<script>
import http from "../http-common";
export default {
  name: "clientes-lista",
  data() {
    return {
      clientes: [],
    };
  },
  methods: {
    recuperaClientes() {
      http
        .get("/clientes")
        .then((response) => {
          this.clientes = response.data; // JSON are parsed automatically.console.log(response.data);
        })
        .catch((e) => {
          console.log(e);
        });
    },
    refreshList() {
      this.recuperaClientes();
    },
  },
  mounted() {
    this.recuperaClientes();
  },
};
</script>
<style>
.list {
  text-align: left;
  width: 100%;
  margin: auto;
  padding-left: 6rem;
}

.titulo-lista {
  font-size: 1.8rem;
  font-weight: 700;
}

ul li a {
  text-decoration: none;
  color: #333;
  font-weight: 600;
  font-size: 1.2rem;
}
</style>