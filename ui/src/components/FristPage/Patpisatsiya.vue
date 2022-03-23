<template>
  <div class="patpisatsiya">
    <div class="patpisatsiya__title">
      Подписаться на нас
    </div>

    <div class="div">
      <div class="top">
        <img src="../../assets/img/top_img.svg" alt="">
        <div class="text">
          ПОДПИШИТЕСЬ НА ИНФОРМАЦИОННЫЙ БЮЛЛЕТЕНЬ
        </div>
      </div>
      <div class="mid">
        <div class="mid1">
          <img src="../../assets/img/pticka.svg" alt="">
          <div class="text">
            Самая свежая информация о продуктах
          </div>
        </div>
        <div class="mid1">
          <img src="../../assets/img/pticka.svg" alt="">
          <div class="text">
            Самая свежая информация о продуктах
          </div>
        </div>
      </div>
      <button>
        Подписаться
      </button>

    </div>

    <div class="fazliddin">
      <div class="allphone">

        <div class="newtel">
          <div class="tel1">
            <img src="../../assets/img/call.svg" alt="">
            <a href="tel:=+998 95 607 54 00" class="callnumber">
              (+998 95) 607 54 00
            </a>
          </div>
          <div class="tel1">
            <img src="../../assets/img/call.svg" alt="">
            <a href="tel:=+998 91 331 00 47" class="callnumber">
              (+998 91) 331 00 47
            </a>
          </div>
        </div>

      </div>

      <div class="allphone">

        <div class="newtel">
          <div class="tel1">
            <img src="../../assets/img/call.svg" alt="">
            <a href="tel:=+998 95 607 54 00" class="callnumber">
              (+998 95) 607 54 00
            </a>
          </div>
          <div class="tel1">
            <img src="../../assets/img/location.svg" alt="">
            <a href="https://www.google.com/maps/@40.0753355,65.3673116,1680m/data=!3m1!1e3" target="_blank" class="callnumber">
              Адрес: Узбекистан, г.Навои
            </a>
          </div>
        </div>

      </div>

      <div class="allphone">
        <div class="newtel">
          <div class="tel1">
            <img src="../../assets/img/email.png" alt="">
            <a href="mailto:ifa-65@mail.ru" class="callnumber">
              ifa-65@mail.ru
            </a>
          </div>
          <div class="tel2">
            <a href="#"><img src="../../assets/img/instagram.svg" alt=""></a>
            <a href="#"><img src="../../assets/img/facebook.svg" alt=""></a>
            <a href="#"><img src="../../assets/img/telegram.svg" alt=""></a>
          </div>
        </div>



      </div>
    </div>

    <br>
    <br>
    <br>
  </div>
</template>

<script>
export default {
  name: "Patpisatsiya"
}
</script>

<style scoped lang="scss">
.patpisatsiya{
  max-width: 1720px;
  margin: auto;
  .patpisatsiya__title{
    font-size: 48px;
    line-height: 57px;
    color: #282525;
    margin-bottom: 92px;
    width: 1720px;
    font-family: 'Marmelad-R';
    margin-top: 120px;

  }
  .div{
    display: flex;
    align-items: center;
    justify-content: space-between;
    //width: 1630px;
    //margin: auto;
    height: 220px;
    background: #F7F7F7;
    margin-bottom: 120px;
    padding: 46px;

    .top {
      display: flex;
      justify-content: space-between;
      align-items: center;
      .text{
        font-size: 28px;
        line-height: 34px;
        color: #282525;
        width: 469px;
        margin-left: 46px;
      }
    }
    .mid{
      .mid1{
        display: flex;
        justify-content: space-between;
        align-items: center;
        margin-bottom: 24px;
        .text{
          font-size: 18px;
          line-height: 22px;
          color: #282525;

        }
      }
    }
    button{
      display: flex;
      align-items: center;
      justify-content: center;
      justify-items: center;
      font-weight: 600;
      font-size: 24px;
      line-height: 29px;
      width: 309px;
      height: 87px;
      background: linear-gradient(180deg, #2FA1F3 3.7%, #1179BF 100%);
      box-shadow: 0px 4px 0px #0C60A5;
      border-radius: 8px;

      color: #FFFFFF;
    }
  }
  .fazliddin{
    display: flex;
    justify-content: space-between;
    .allphone{
      margin-bottom: 46px;
      display: flex;
      align-items: center;
      justify-content: space-between;
      padding: 0 100px 0 100px;

      .tel1{
        display: flex;
        align-items: center;
        margin-bottom: 46px;
        img{
          margin-right: 32px;
        }
        a{
          color: #303439;
          &:hover{
            color: #1976d2;
            text-decoration: revert;
          }
        }
      }
    .tel2{
      display: flex;
      align-items: center;
      margin-bottom: 46px;
      img{
        margin-right: 32px;
      }

    }

    }
  }
}
@media (max-width: 1700px) {
  .subscribe_us {
    padding: 0 40px;

    .subscribe_block {
      .sub_info {
        flex-direction: column;

        .sub {
          margin-bottom: 23px;
        }
      }
    }
  }

}

@media (max-width: 1350px) {

  .subscribe_us {
    h1 {
      font-size: 28px;
      line-height: 33px;
      margin-bottom: 30px;
    }

    .subscribe_block {
      padding: 20px 50px 12px 30px;

      .sub_info {
        flex-direction: column;

        .sub {
          margin-bottom: 20px;
          margin-right: 0;

          a {
            img {
              width: 50px;
              height: 50px;
              margin-right: 10px;
            }
          }

          p {
            font-size: 18px;
            width: auto;
            line-height: 22px;
          }
        }

        .adding {
          p {
            font-size: 12px;
            line-height: 130%;
          }
        }
      }

      button {
        width: 189px;
        padding: 15px 0;
        font-size: 16px;
        line-height: 19px;

      }
    }

    .info_part {
      margin: 40px 0 60px 0;
      padding: 0 16px;

      .part {
        .number {
          a {
            &:nth-child(2) {
              margin-left: 16px;
            }

            &:nth-child(3) {
              margin-left: 16px;
            }

            img {
              width: 25px;
              height: 25px;

            }
          }

          p {
            margin-left: 10px;
            font-size: 12px;
            line-height: 14px;
          }
        }
      }

    }
  }

}

@media (max-width: 750px) {
  .subscribe_us {
    padding: 0;

    h1 {
      padding-left: 16px;
      margin-bottom: 23px;
    }

    .subscribe_block {
      padding: 10px 16px 20px 16px;
      flex-direction: column;
      align-items: start;

      .sub_info {
        margin-bottom: 46px;

        .sub {
          margin-bottom: 24px;

          a {
            img {

            }
          }

          p {
          }
        }

        .adding {
          p {

          }
        }
      }

      button {


      }
    }

    .info_part {

    }
  }
}

@media (max-width: 500px) {

  .subscribe_us {
    .info_part {
      flex-direction: column;
      align-items: start;
      margin: 24px 0 60px 0;
      .part {
        &:nth-child(3){
          .number {
            &:nth-child(2){
              margin-bottom: 0;
            }
          }
        }
        .number {
          margin-bottom: 24px;
          &:nth-child(1){
            margin-bottom: 24px;
          }
          a {
            &:nth-child(2) {
            }

            &:nth-child(3) {
            }

            img {
              width: 25px;
              height: 25px;

            }
          }

          p {
          }
        }
      }

    }
  }

}
</style>