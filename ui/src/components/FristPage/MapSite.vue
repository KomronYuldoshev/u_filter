<template>
  <div class="map">
    <h1>Карта сайта</h1>
    <div class="iframe">
      <iframe
          src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d1498.471413318192!2d69.30772528038733!3d41.310107371816784!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x38ae89718befffff%3A0x1b1418e9c63ed2d9!2zUG9sYXJ0LnV6IC0g0J_RgNC-0LjQt9Cy0L7QtNGB0YLQstC-INC60LDRgNGC0L7QvdC90YvRhSDQuCDQs9C-0YTRgNC-0LrQsNGA0YLQvtC90L3Ri9GFINGD0L_QsNC60L7QstC-0Lo!5e0!3m2!1suz!2s!4v1644805095688!5m2!1suz!2s"
          width="100%"
          height="780"
          style="border: 0"
          allowfullscreen=""
          loading="lazy"
      ></iframe>
    </div>
  </div>
</template>

<script>
export default {
  name: "MapSite"
}
</script>

<style scoped lang="scss">

.map {
  margin: 120px 0;

  h1 {
    padding-left: 100px;
    font-family: 'Marmelad-R';
    font-style: normal;
    font-weight: 400;
    font-size: 48px;
    line-height: 57px;
    color: #282525;
    margin-bottom: 92px;
  }

  .iframe {
    iframe {

    }
  }
}

@media (max-width: 768px) {
  .map {
    margin: 60px 0;

    h1 {
      padding-left: 40px;
      margin-bottom: 30px;
      font-size: 28px;
      line-height: 33px;
    }

    .iframe {
      height: 318px;

      iframe {
        height: 318px;

      }
    }
  }
}

@media (max-width: 360px) {
  .map {
    margin: 40px 0 60px 0;

    h1 {
      padding-left: 16px;
      margin-bottom: 24px;
      font-size: 28px;
      line-height: 33px;
    }

    .iframe {
      height: 318px;

      iframe {
        height: 318px;

      }
    }
  }
}

</style>