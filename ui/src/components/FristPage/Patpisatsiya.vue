<template>
  <div class="patpisatsiya">
    <div class="patpisatsiya__title">
      Подписаться на нас
    </div>
    <div class="div">
     <div class="top_mid">
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

    .top_mid{
      display: flex;
      align-items: center;
      justify-content: space-between;
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
          margin-left: 46px;
          .text{
            font-size: 18px;
            line-height: 22px;
            color: #282525;

          }
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
</style>
<!--===========================================-->

<style scoped lang="scss">
@media screen and (max-width: 1000px){
  .patpisatsiya{
    max-width: 768px;
    margin: auto;
    .patpisatsiya__title{
      font-size: 28px;
      line-height: 33px;
      color: #282525;
      margin-bottom: 92px;
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

      .top_mid{
        flex-wrap: wrap;
        align-items: center;
        justify-content: space-between;
        .top {
          display: flex;
          justify-content: space-between;
          align-items: center;
          .text{
            font-size: 18px;
            line-height: 22px;
            color: #282525;
            max-width: 300px;
            margin-left: 26px;
          }
        }
        .mid{
          .mid1{
            display: flex;
            justify-content: space-between;
            align-items: center;
            margin-bottom: 24px;
            margin-left: 20px;
            .text{
              font-size: 18px;
              line-height: 22px;
              color: #282525;

            }
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
}
</style>
<style scoped lang="scss">
@media screen and (max-width: 768px){
  .patpisatsiya{
    max-width: 360px;
    margin: auto;
    .patpisatsiya__title{
      font-size: 28px;
      line-height: 33px;
      color: #282525;
      margin-bottom: 24px;
      font-family: 'Marmelad-R';


    }
    .div{
      flex-wrap: wrap;
      align-items: center;
      justify-content: space-between;
      height: 250px;
      background: #F7F7F7;
      margin-bottom: 120px;
      padding: 0;
      margin-left: 0;
      .top_mid{
        flex-wrap: wrap;
        align-items: center;
        justify-content: space-between;

        .top {
          display: flex;
          justify-content: space-between;
          align-items: center;
          img{
            width: 80px;
          }
          .text{
            font-size: 16px;
            line-height: 20px;
            color: #282525;
            max-width: 300px;
            margin-left: 0px;
          }
        }
        .mid{
          .mid1{
            display: flex;
            justify-content: space-between;
            align-items: center;
            margin-bottom: 8px;
            margin-left: 16px;
            max-width: 360px;
            .text{
              font-size: 12px;
              line-height: 130%;
              color: #282525;
              margin-bottom: 0px;
            }
          }
        }
      }
      button{
        display: flex;
        align-items: center;
        justify-content: center;
        justify-items: center;
        font-weight: 600;
        font-size: 16px;
        line-height: 19px;
        width: 189px;
        height: 50px;
        background: linear-gradient(180deg, #2FA1F3 3.7%, #1179BF 100%);
        box-shadow: 0px 4px 0px #0C60A5;
        border-radius: 8px;
        color: #FFFFFF;
      }
    }
    .fazliddin{
      flex-wrap: wrap;
      .allphone{
        margin-bottom: 46px;
        flex-wrap: wrap;
        align-items: center;
        justify-content: space-between;
        padding: 0 100px 0 100px;

        .tel1{
          flex-wrap: wrap;
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
}
</style>