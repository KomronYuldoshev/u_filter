<template>
  <div>
    <div class="top">
      <div class="input__btn">
        <div class="input">
          <img src="../../assets/img/search.svg" alt="">
          <input type="text" placeholder="Поиск">
        </div>
        <span></span>
        <div class="select">
          <select name="" id="">
            <option value="" disabled="disabled" selected="selected" hidden="hidden">Выбрать марку</option>
            <option value="">salom</option>
            <option value="">salom</option>
          </select>
          <img src="../../assets/img/bottom.png" alt="">
        </div>
        <span></span>
        <div class="select">
          <select name="" id="">
            <option value="" disabled="disabled" selected="selected" hidden="hidden">Выбрать модель</option>
            <option value="">salom</option>
            <option value="">salom</option>
          </select>
          <img src="../../assets/img/bottom.png" alt="">
        </div>
        <span></span>
        <div class="search__btn">
          <button>Поиск</button>
        </div>
      </div>
    </div>
    <div class="special__filters">
      <div class="special__filters--check">
        <form action="">
          <div class="radio" :class="{'active' : radio1}">
            <input type="radio" id="one" name="gender" @change="back(1)">
            <label for="one">ЛЕГКОВЫЕ АВТОМОБИЛИ</label>
          </div>
          <div class="radio" :class="{'active' : radio2}">
            <input type="radio" id="two" name="gender" @change="back(2)">
            <label for="two">ГРУЗОВЫЕ АВТОМОБИЛИ</label>
          </div>
          <div class="radio" :class="{'active' : radio3}">
            <input type="radio" id="three" name="gender" @change="back(3)">
            <label for="three">Специальные фильтры </label>
          </div>
          <div class="radio" :class="{'active' : radio4}">
            <input type="radio" id="four" name="gender" @change="back(4)">
            <label for="four">производственные фильтры</label>
          </div>
        </form>
      </div>
    </div>
    <div class="cards">
      <div class="card">
        <div class="top__card">
          <div class="img__text">
            <div class="img">
              <img src="../../assets/img/slideimg.png" alt="">
            </div>
            <div class="text">K 1381A</div>
          </div>
        </div>
        <div class="main__img">
          <img src="../../assets/img/filterslide.png" alt="">
        </div>
        <div class="bottom">
          <div class="fil__info">
            Kia Sorento 3, Toyota C-HR
          </div>
        </div>
        <div class="fil__id">
          K 1381A
        </div>
      </div>
      <div class="card">
        <div class="top__card">
          <div class="img__text">
            <div class="img">
              <img src="../../assets/img/slideimg.png" alt="">
            </div>
            <div class="text">K 1381A</div>
          </div>
        </div>
        <div class="main__img">
          <img src="../../assets/img/filterslide.png" alt="">
        </div>
        <div class="bottom">
          <div class="fil__info">
            Kia Sorento 3, Toyota C-HR
          </div>
        </div>
        <div class="fil__id">
          K 1381A
        </div>
      </div>
      <div class="card">
        <div class="top__card">
          <div class="img__text">
            <div class="img">
              <img src="../../assets/img/slideimg.png" alt="">
            </div>
            <div class="text">K 1381A</div>
          </div>
        </div>
        <div class="main__img">
          <img src="../../assets/img/filterslide.png" alt="">
        </div>
        <div class="bottom">
          <div class="fil__info">
            Kia Sorento 3, Toyota C-HR
          </div>
        </div>
        <div class="fil__id">
          K 1381A
        </div>
      </div>
      <div class="card">
        <div class="top__card">
          <div class="img__text">
            <div class="img">
              <img src="../../assets/img/slideimg.png" alt="">
            </div>
            <div class="text">K 1381A</div>
          </div>
        </div>
        <div class="main__img">
          <img src="../../assets/img/filterslide.png" alt="">
        </div>
        <div class="bottom">
          <div class="fil__info">
            Kia Sorento 3, Toyota C-HR
          </div>
        </div>
        <div class="fil__id">
          K 1381A
        </div>
      </div>
      <div class="card">
        <div class="top__card">
          <div class="img__text">
            <div class="img">
              <img src="../../assets/img/slideimg.png" alt="">
            </div>
            <div class="text">K 1381A</div>
          </div>
        </div>
        <div class="main__img">
          <img src="../../assets/img/filterslide.png" alt="">
        </div>
        <div class="bottom">
          <div class="fil__info">
            Kia Sorento 3, Toyota C-HR
          </div>
        </div>
        <div class="fil__id">
          K 1381A
        </div>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  data(){
    return{
      radio1: false,
      radio2: false,
      radio3: false,
      radio4: false,
    }
  },
  methods:{
    back(n){
      if (n==1){
        this.radio1 = true
        this.radio2 = false
        this.radio3 = false
        this.radio4 = false
      }
      if (n==2){
        this.radio1 = false
        this.radio2 = true
        this.radio3 = false
        this.radio4 = false
      }
      if (n==3){
        this.radio1 = false
        this.radio2 = false
        this.radio3 = true
        this.radio4 = false
      }
      if (n==4){
        this.radio1 = false
        this.radio2 = false
        this.radio3 = false
        this.radio4 = true
      }
      // console.log('back')
    }
  }
}
</script>
<style lang="scss" scoped>
  .top {
    margin-left: 100px;
    .input__btn{
      width: 1210px;
      height: 67px;
      //border: 1px solid red;
      display: flex;
      justify-content: space-between;
      align-items: center;
      background: #FFFFFF;
      box-shadow: 0px 4px 40px rgba(0, 0, 0, 0.1);
      border-radius: 10px;
      .input{
        display: flex;
        align-items: center;
        input{
          padding-left: 24px;
          &::placeholder{
            font-size: 18px;
            line-height: 21px;
            color: #737579;
          }
        }
        img{
          margin-left: 32px;
        }
      }
      span{
        width: 2px;
        height: calc(100% - 30px);
        display: block;
        background: #DFDFDF;
        margin: 0px 32px;
      }
      .search__btn{
        margin-right: 46px;
        button{
          width: 114px;
          height: 45px;
          display: flex;
          align-items: center;
          justify-content: center;
          background: linear-gradient(180deg, #2FA1F3 0%, #1179BF 74.42%);
          border-radius: 9.28725px;
          font-size: 18px;
          line-height: 21px;
          color: #FFFFFF;
        }
      }
      .select{
        position: relative;
        display: flex;
        align-items: center;
        select{
          width: 217px;
          font-size: 18px;
          line-height: 21px;
          color: #737579;
        }
        img {
          position: absolute;
          right: 0;
        }
      }
    }
  }
  .special__filters{
    //margin-top: 300px;
    margin-left: 100px;
    .special__filters--check{
      form{
        display: flex;
        align-items: center;
        .radio{
          width: 300px;
          height: 54px;
          display: flex;
          align-items: center;
          justify-content: center;
          border: 1px solid #B2B2B2;
          margin: 32px 0;
          &:nth-child(1){
            border-radius: 0px 0px 0px 10px;
            &.active{
              border-radius: 0px 0px 0px 10px;
            }
          }
          &:last-child{
            border-radius: 0px 10px 0px 0px;
            &.active{
              border-radius: 0px 10px 0px 0px;
            }
          }
          &.active{
            background: var(--blue);
            border: 1px solid var(--blue);
            label{
              color: white;
              font-family: 'Lato-Medium';
            }
          }
        }
      }
      label{
        font-size: 16px;
        line-height: 19px;
        color: #000;
        margin-left: 24px;
        font-family: 'Lato-Medium';
      }
      input{
        width: 22px;
        height: 22px;
        border: 6px solid white;
        border-radius: 50px;
      }
      input:checked   label{
        background: red;
      }
    }
  }
  .cards{
    display: flex;
    justify-content: space-between;
    flex-wrap: wrap;
    //margin-left: 28px;
    //margin-right: 100px;
    margin-top: 24px;
  }
  .card{
    background: #FFFFFF;
    border: 2.5px solid #2C83C5;
    box-sizing: border-box;
    box-shadow: 0px 4px 40px rgba(0, 0, 0, 0.1);
    height: 450px;
    position: relative;
    margin-left: 32px;
    margin-top: 64px;
    width: 406px;
    .top__card{
      padding: 0px 24px;
      .img__text{
        display: flex;
        align-items: center;
        justify-content: space-between;
        .text{
          font-size: 24px;
          line-height: 29px;
          letter-spacing: 0.125em;
          text-transform: capitalize;
          color: #2C83C5
        }
      }
    }
    .main__img{
      display: flex;
      justify-content: center;
      margin-top: 25px;
      margin-bottom: 7px;
    }
    .bottom{
      .fil__info{
        text-align: center;
        font-size: 24px;
        line-height: 29px;
        letter-spacing: 0.125em;
        text-transform: capitalize;
        color: #282525;
        font-family: 'Lato-Medium';
        margin-bottom: 16px;
      }
    }
    .fil__id{
      text-align: center;
      font-size: 16px;
      line-height: 19px;
      letter-spacing: 0.125em;
      text-transform: capitalize;
      font-family: 'Lato-Regular';
      color: #FFFFFF;
      background: var(--blue);
      width: 100.5%;
      position: absolute;
      bottom: 0;
      padding: 12px;
    }
  }
</style>