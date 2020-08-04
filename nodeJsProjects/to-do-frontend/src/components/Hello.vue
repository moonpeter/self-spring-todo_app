<template>
  <div class="hello">
    오늘 해야 할 일
    <ul v-if="toDoItems && toDoItems.length">
      <li v-for="toDoItem of toDoItems">
        {{toDoItem.title}}
      </li>
    </ul>
  </div>
</template>

<script>
import axios from 'axios' // 아까 받은 axios 패키지를 사용하기 위해 import한다

export default {
  name: 'hello',
  data: () => {
    return {
      toDoItems: []
    }
  },
  created () {
    axios.get('http://127.0.0.1:5000/todo/') // http://localhost:5000/todo/에 get call을 한다.
      .then(response => {
        this.toDoItems = response.data.map(r => r.data)
      })
      .catch(e => {
        console.log('error : ', e)
      })
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style>
h1, h2 {
  font-weight: normal;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 10px;
}

a {
  color: #35495E;
}
</style>



출처: https://imasoftwareengineer.tistory.com/41 [삐멜 소프트웨어 엔지니어]
