<template>
  <div>
    <div class="special__filters">
      <div class="special__filters--title">
        Специальные фильтры
      </div>
      <div class="special__filters--check">
        <form action="">
          <div class="selected" @click="select">
            <input type="radio">
            <label> {{selected}}</label>
            <img  :style="dropdown ? 'transform: rotate(180deg)' : '' " src="../../assets/img/arrow-down.svg" alt="arrow-down">
          </div>
          <div v-for="filter in filters"   :style="dropdown ? '' : 'display:none' "   :key="filter.index" class="radio"  :class="{'active' : filter.radio}">
            <input type="radio" :id="filter.id" name="gender" @change="back(filter)"
                   :checked="filter.number == 1 ? 'checked ' : '' ">
            <label :for="filter.id">{{ filter.name }}</label>
          </div>
        </form>
      </div>
    </div>
<!--        <div class="filter">-->
<!--          <div class="img">-->
<!--            <img src="../../assets/img/filter1.png" alt="">-->
<!--          </div>-->
<!--          <div class="text data__aos" data-aos="fade-right">-->
<!--            <span class="hr__span"></span>-->
<!--            <div class="title__menu">-->
<!--              САЛОННЫЕ ФИЛЬТРЫ С ИННОВАЦИОННОЙ ТЕХНОЛОГИЕЙ PROT-->
<!--              <span>ECT+</span>-->
<!--            </div>-->
<!--            <div class="text__info">-->
<!--              Салонный фильтр очищает воздух в салоне автомобиля, которым дышат пассажиры и водитель. Все салонные фильтры марки FILTRON эффективно задерживают загрязняющие вещества. Они в стандартной комплектации оснащены технологией PROTECT+, которая дополнительно задерживает аллергены и предотвращает рост бактерий и плесени на фильтре.-->
<!--            </div>-->
<!--          </div>-->
<!--        </div>-->
<!--        <div class="filter2">-->
<!--          <div class="text data__aos" data-aos="fade-left">-->
<!--            <span class="hr__span"></span>-->
<!--            <div class="title__menu">-->
<!--              ФИЛЬТРЫ ОХЛАЖДАЮЩЕЙ ЖИДКОСТИ-->
<!--            </div>-->
<!--            <div class="text__info">-->
<!--              Фильтры охлаждающей жидкости используются в больших дизельных двигателях грузовиков и эксплуатируемой техники. Их основная задача заключается в фильтрации охлаждающей жидкости и эффективном улавливании твердых примесей. В большинстве фильтров жидкостей содержатся активные вещества - ингибиторы коррозии, которые постепенно выпускаются в охлаждающую жидкость и дополняют уровень разлагающихся во время эксплуатации добавок, поддерживая на постоянном, высоком уровне теплопроводность жидкости, а также ее антикоррозийные и антикавитационные свойства.-->
<!--            </div>-->
<!--          </div>-->
<!--          <div class="img">-->
<!--            <img src="../../assets/img/filter2.png" alt="">-->
<!--          </div>-->
<!--        </div>-->
<!--        <div class="video">-->
<!--          <img src="../../assets/img/video.png" alt="">-->
<!--        </div>-->
  </div>
</template>
<script>
export default {
  data() {
    return {
      filters: [
        {
          number: 1,
          id: 'one',
          radio: true,
          name: 'ЛЕГКОВЫЕ АВТОМОБИЛИ'
        },
        {
          number: 2,
          id: 'two',
          radio: false,
          name: 'ГРУЗОВЫЕ АВТОМОБИЛИ'
        },
        {
          number: 3,
          id: 'three',
          radio: false,
          name: 'СПЕЦИАЛЬНЫЕ ФИЛЬТРЫ'
        },
        {
          number: 4,
          id: 'four',
          radio: false,
          name: 'ПРОИЗВОДСТВЕННЫЕ ФИЛЬТРЫ'
        },
      ],
      dropdown: false,
      selected: ''
    }
  },
  methods: {
    back(item) {
      this.selected = item.name
      this.dropdown = !this.dropdown
      this.filters.map((v) => {
        if (v.number === item.number) {
          v.radio = true
        } else {
          v.radio = false
        }
      })
    },
    select(){
      this.dropdown = !this.dropdown
    }
  },
  mounted() {
    this.filters.map( (va)=>{
      if( va.number == 1){
        this.selected  =  va.name
      }
    })
  }
}
</script>
<style lang="scss" scoped>

@import "../../assets/style/FirstPage/SpecialFilter.scss";
</style>