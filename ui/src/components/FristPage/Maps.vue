<template>
  <div class="maps">
    <div class="map__title">
      Карта сайта
    </div>
    <iframe src="https://www.google.com/maps/embed?pb=!1m10!1m8!1m3!1d11925.794663923398!2d65.3673116!3d40.0753355!3m2!1i1024!2i768!4f13.1!5e1!3m2!1suz!2s!4v1647066136565!5m2!1suz!2s" width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy"></iframe>
     </div>
</template>

<script>
export default {
  name: "Maps"
}
</script>

<style scoped lang="scss">
.maps{
  margin-bottom: 120px;
  width: 100%;
  .map__title{
    font-family: 'Marmelad-R';
    font-style: normal;
    font-weight: normal;
    font-size: 48px;
    line-height: 57px;
    color: #282525;
    width: 1720px;
    margin: auto;
    margin-bottom: 92px;
  }
}
iframe{
  width: 100%;
  height: 780px;
}
</style>
<style scoped lang="scss">
@media screen and (max-width: 3000px){

}
</style>