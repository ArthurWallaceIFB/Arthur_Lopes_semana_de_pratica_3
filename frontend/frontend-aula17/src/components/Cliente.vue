<template>
  <div class="cliente_container" v-if="this.cliente">
    <span class="titulo_cliente">Cliente</span>
    <div style="margin-top: 0.5rem"><label>Nome: </label> {{ this.cliente.nome }}</div>
    <div><label>Idade: </label> {{ this.cliente.idade }}</div>
    <div><label>Ativo: </label> {{ this.cliente.ativo }}</div>
    <button
      v-if="this.cliente.ativo"
      v-on:click="updateAtivo(false)"
      class="btn btn-primary"
    >
      Inativo
    </button>
    <button
      v-else
      v-on:click="updateAtivo(true)"
      class="btn btn-success"
    >
      Ativo
    </button>
    <button class="btn btn-danger" v-on:click="deleteCliente()">
      Delete
    </button>
  </div>
  <div v-else>
    <br />
    <p>Clique em um cliente...</p>
  </div>
</template>
<script>
import http from "../http-common";
export default {
  name: "cliente",
  props: ["cliente"],
  methods: {
    updateAtivo(status) {
      var data = {
        id: this.cliente.id,
        nome: this.cliente.nome,
        idade: this.cliente.idade,
        ativo: status,
      };
      http
        .put("/cliente/" + this.cliente.id, data)
        .then((response) => {
          this.cliente.ativo = response.data.ativo;
          console.log(response.data);
        })
        .catch((e) => {
          console.log(e);
        });
    },
    deleteCliente() {
      http
        .delete("/cliente/" + this.cliente.id)
        .then((response) => {
          console.log(response.data);
          this.$emit("refreshData");
          this.$router.push("/");
        })
        .catch((e) => {
          console.log(e);
        });
    },
  },
};
</script>
<style>
.cliente_container{
    width: auto;
    padding-left: 5rem;
}

.titulo_cliente{
    font-weight: 700;
    font-size: 1.5rem;
    text-decoration: underline;
    color: #333;
    padding-bottom: 1rem;
    margin-left: -1rem;
}

.btn{
  padding: 0.6rem 1rem;
  width: 5rem;
  border-radius: 2rem;
  font-weight: 600;
  border: 1px solid black;
  background: #e9e9e9;
  font-size: 1rem;
  margin-right: 1rem;
}
</style>