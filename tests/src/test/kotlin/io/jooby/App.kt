package io.jooby

data class SearchQuery(val q: String)

fun main(args: Array<String>) {
  run(args) {
    println(basePackage())
    get {
      val q = ctx.query<SearchQuery>()
      q.q
    }
  }
}
