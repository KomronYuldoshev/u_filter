<template>
  <div class="footer">
    <div class="title">
      О компании
    </div>
    <div class="text">
      Вот уже семь лет наша компания производит продукцию международного

      стандарта ISO 9001 и осуществляет поставку своей готовой продукции на

      внутренний и на внешний рынок.
    </div>
    <div class="coco">
      <div class="cocotext">
        © OOO "Universal Filter" - Ваш надежный партнер!
      </div>
      <a href="http://radium.uz/" target="_blank">
        <img src="../../assets/img/radium_bottom.png" alt="">
      </a>
    </div>
  </div>
</template>

<script>
export default {
  name: "Footer"
}
</script>

<style scoped lang="scss">

.footer{
  background-image: url("../../assets/img/footer_img.jpg");
  max-width: 1920px;
  height: 780px;
  margin: auto;
  .title{
    font-family: 'Marmelad-R';
    font-style: normal;
    font-weight: normal;
    font-size: 48px;
    line-height: 57px;
    text-align: center;
    color: #FFFFFF;
    padding-top: 214px;
    margin-bottom: 32px;
  }
  .text{
    font-family: Lato-Regular;
    font-style: normal;
    font-weight: normal;
    font-size: 24px;
    line-height: 29px;
    text-align: center;
    color: #FFFFFF;
    max-width: 950px;
    margin: 0 auto 228px auto;
  }
  .coco{
    display: flex;
    justify-content: space-between;
    align-items: center;
    max-width: 1920px;
    margin: auto;
    .cocotext{
      font-family: Lato-Regular;
      font-style: normal;
      font-weight: normal;
      font-size: 18px;
      line-height: 22px;
      color: #FFFFFF;
      padding-left: 100px;
    }
    img{
      padding-right: 100px;
    }
  }
}

</style>
<!--=======================================-->
<style scoped lang="scss">
@media screen and (max-width: 1000px){
  .footer{
    background-image: url("../../assets/img/footer_img.jpg");
    max-width: 1000px;
    height: 369px;
    margin: auto;
    .title{
      font-family: 'Marmelad-R';
      font-style: normal;
      font-weight: normal;
      font-size: 28px;
      line-height: 33px;
      text-align: center;
      color: #FFFFFF;
      padding-top: 64px;
      margin-bottom: 24px;
    }
    .text{
      font-family: Lato-Regular;
      font-style: normal;
      font-weight: normal;
      font-size: 14px;
      line-height: 17px;
      text-align: center;
      color: #FFFFFF;

      max-width: 380px;
      margin: 0 auto 120px auto;
    }
    .coco{
      display: flex;
      justify-content: space-between;
      align-items: center;
      max-width: 1000px;
      margin: auto;
      .cocotext{
        font-family: Lato-Regular;
        font-style: normal;
        font-weight: 400;
        font-size: 12px;
        line-height: 14px;
        color: #FFFFFF;
        padding-left: 40px;
      }
      img{
        padding-right: 40px;
        width: 150px;

      }
    }
  }
}
</style>
<!--=======================================-->
<style scoped lang="scss">
@media screen and (max-width: 730px){
  .footer{
    background-image: url("../../assets/img/footer_img.jpg");
    max-width: 1000px;
    height: 369px;
    margin: auto;
    .title{
      font-family: 'Marmelad-R';
      font-style: normal;
      font-weight: normal;
      font-size: 28px;
      line-height: 33px;
      text-align: center;
      color: #FFFFFF;
      padding-top: 64px;
      margin-bottom: 24px;
    }
    .text{
      font-family: Lato-Regular;
      font-style: normal;
      font-weight: normal;
      font-size: 14px;
      line-height: 17px;
      text-align: center;
      color: #FFFFFF;
      padding: 0 10px 0 10px;
      max-width: 380px;
      margin: 0 auto 120px auto;
    }
    .coco{
      display: flex;
      justify-content: space-between;
      align-items: center;
      max-width: 1000px;
      margin: auto;
      .cocotext{
        font-family: Lato-Regular;
        font-style: normal;
        font-weight: 400;
        font-size: 12px;
        line-height: 14px;
        color: #FFFFFF;
        padding-left: 40px;
      }
      img{
        padding-right: 40px;
        width: 150px;

      }
    }
  }
}
</style>
