<template>
  <div class="maps">
    <div class="title">
      Карта сайта
    </div>
    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d1498.4718291901272!2d69.30787487682612!3d41.3100892781337!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x38ae89718befffff%3A0x1b1418e9c63ed2d9!2zUG9sYXJ0LnV6IC0g0J_RgNC-0LjQt9Cy0L7QtNGB0YLQstC-INC60LDRgNGC0L7QvdC90YvRhSDQuCDQs9C-0YTRgNC-0LrQsNGA0YLQvtC90L3Ri9GFINGD0L_QsNC60L7QstC-0Lo!5e0!3m2!1suz!2s!4v1646825626791!5m2!1suz!2s" width="1920" height="780" style="border:0;" allowfullscreen="" loading="lazy"></iframe>
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
  width: 1920px;
  margin: auto;

  .title{
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
</style>
<!--==================================================================-->
<style scoped lang="scss">
@media screen and (max-width: 3000px){

}
</style>