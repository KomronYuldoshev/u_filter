<template>
  <div class="all_services">
    <div class="services">
      <div v-for="service in services" :key="service.index" class="tip__service">
        <div class="tip__service--img">
          <img :src="service.picture" alt="">
        </div>
        <div class="tip__service--text">
          {{ service.title }}
        </div>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      services: [
        {
          picture: require('../../assets/img/servise1.svg'),
          title: 'Воздушные фильтры'
        }, {
          picture: require('../../assets/img/servise2.svg'),
          title: 'Cалонный фильтры'
        }, {
          picture: require('../../assets/img/servise3.svg'),
          title: 'Масляные фильтры'
        }, {
          picture: require('../../assets/img/servise4.svg'),
          title: 'Топливные фильтры'
        }, {
          picture: require('../../assets/img/servise5.svg'),
          title: 'Другие'
        }
      ]
    }
  }
}

</script>
<style lang="scss" scoped>
@import "../../assets/style/Services/Services";
</style>