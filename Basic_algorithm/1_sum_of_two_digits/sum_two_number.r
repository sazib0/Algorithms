sum_of_total_number <- function (first,second){
  first <-  as.numeric(first)
  second <-  as.numeric(second)
  return (first + second )
}

main <- function(a,b){
  { a <- readline("Input value a: "); b <- readline("INput value b: ")}
  print(sum_of_total_number(a,b))
}

main()
