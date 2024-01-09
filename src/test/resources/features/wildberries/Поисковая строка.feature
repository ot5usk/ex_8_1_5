#language: ru

@searchBar
@all
Функционал: Поисковая строка

  @search
  Структура сценария: Поиск товара
    Дано пользователь находится на главной странице
    Когда пользователь нажимает на поисковую строку
    И вводит в поисковую строку <product_name>
    И нажимает Enter
    Тогда на странице с результатами поиска отображается текст: <product_name>
    И первый фильтр: <product_name>
    И применен фильтр: “По популярности”
    И у первой карточки товара из списка бренд: <product_brand>
    Когда пользователь нажимает на крестик в поисковой строке
    Тогда крестик исчезает
    Примеры:
      | product_name | product_brand |
      | "Iphone 13"  | "Apple"       |