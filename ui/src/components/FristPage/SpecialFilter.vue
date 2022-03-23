<template>
  <div>
    <div class="special__filters">
      <div class="special__filters--title">
        Специальные фильтры
      </div>
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
            <label for="three">СПЕЦИАЛЬНЫЕ ФИЛЬТРЫ</label>
          </div>
          <div class="radio" :class="{'active' : radio4}">
            <input type="radio" id="four" name="gender" @change="back(4)">
            <label for="four">ПРОИЗВОДСТВЕННЫЕ ФИЛЬТРЫ</label>
          </div>
        </form>
      </div>
    </div>



    <div class="filter">
      <div class="img">
        <img src="../../assets/img/filter1.png" alt="">
      </div>
      <div class="text data__aos" data-aos="fade-right">
        <span class="hr__span"></span>
        <div class="title__menu">
          САЛОННЫЕ ФИЛЬТРЫ С ИННОВАЦИОННОЙ ТЕХНОЛОГИЕЙ PROT
          <span>ECT+</span>
        </div>
        <div class="text__info">
          Салонный фильтр очищает воздух в салоне автомобиля, которым дышат пассажиры и водитель. Все салонные фильтры марки FILTRON эффективно задерживают загрязняющие вещества. Они в стандартной комплектации оснащены технологией PROTECT+, которая дополнительно задерживает аллергены и предотвращает рост бактерий и плесени на фильтре.
        </div>
      </div>
    </div>



    <div class="filter2">
      <div class="text data__aos" data-aos="fade-left">
        <span class="hr__span"></span>
        <div class="title__menu">
          ФИЛЬТРЫ ОХЛАЖДАЮЩЕЙ ЖИДКОСТИ
        </div>
        <div class="text__info">
          Фильтры охлаждающей жидкости используются в больших дизельных двигателях грузовиков и эксплуатируемой техники. Их основная задача заключается в фильтрации охлаждающей жидкости и эффективном улавливании твердых примесей. В большинстве фильтров жидкостей содержатся активные вещества - ингибиторы коррозии, которые постепенно выпускаются в охлаждающую жидкость и дополняют уровень разлагающихся во время эксплуатации добавок, поддерживая на постоянном, высоком уровне теплопроводность жидкости, а также ее антикоррозийные и антикавитационные свойства.
        </div>
      </div>
      <div class="img">
        <img src="../../assets/img/filter2.png" alt="">
      </div>
    </div>



    <div class="video">
      <img src="../../assets/img/video.png" alt="">
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
@import "../../assets/style/FirstPage/SpecialFilter.scss";
</style>