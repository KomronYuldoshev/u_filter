<template>
  <div class="all">
    <header class="header">
      <div class="logo">
        <div class="active_menu"  :class=" isActive ? 'active' : ''  " @click="menu">
          <span></span>
        </div>
        <a href="/">
          <img src="../assets/img/logo.svg" alt="">
        </a>
      </div>
      <div class="menu"  @mouseup="menu"    :class=" isOpen ? 'open' : ''  ">
        <ul>
          <li v-for="menu in menus" :key="menu.index">
            <router-link
                :to="menu.path"
            >
              {{ $t(menu.name) }}
            </router-link>
            <span></span>
          </li>
        </ul>
      </div>
      <div class="search__language" >
        <div class="search">
          <button>
            <img src="../assets/img/search.svg" alt="">
          </button>
        </div>
        <div class="language">
          <select id="selectLanguage" @change="setLocale">
            <option v-for="value in values" :value="value.lang" :key="value.index"> {{ value.lang }}</option>
          </select>
        </div>
      </div>
    </header>
    <div :class=" isOpen ? 'bg_all' : '' "  @mouseup="menu">
    </div>
  </div>
</template>


<script>

export default {
  data() {
    return {
      menus: [
        {
          path: '/',
          name: 'main'
        }, {
          path: '/product',
          name: 'Продукты'
        }, {
          path: 'kompaniya',
          name: 'Компания'
        }, {
          path: '/Sertificat',
          name: 'Сертификаты'
        }, {
          path: '/contact',
          name: 'Контакты'
        }
      ],
      values: [
        {
          lang: 'EN'
        },
        {
          lang: 'RU'
        },
        {
          lang: 'UZ'
        }
      ],
      isActive: false,
      isOpen: false,

    }
  },
  methods:{
    setLocale(item) {
      let locale = (item.path[0].value).toLowerCase()
      import(`../languages/${locale}.json`).then((msg) => {
        this.$i18n.setLocaleMessage(locale, msg);
        this.$i18n.locale = locale;
        console.log(locale)
        localStorage.setItem("language", locale);
      });
    },
    menu(){
      this.isActive = !this.isActive
      this.isOpen = !this.isOpen
    },



  },
  mounted() {
    let selected = document.getElementById('selectLanguage')
    selected.value = localStorage.getItem("language");
    let name = localStorage.getItem("language");
    if (name === undefined) {
      name = "en"
    }
    if (selected.value === undefined) {
      selected.value = "EN";
    }
    import(`../languages/${name}.json`).then((msg) => {
      this.$i18n.setLocaleMessage(name, msg);
      this.$i18n.locale = name;
      selected.value = name.toUpperCase();
      localStorage.setItem("language", name);
    });
  }
}

</script>
<style scoped lang="scss">
@import "../assets/style/Header";
</style>