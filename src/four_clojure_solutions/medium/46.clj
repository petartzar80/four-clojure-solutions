(ns four-clojure-solutions.medium.46)

;; Write a higher-order function which flips the order of the arguments of an input function.

(defn flip [input]
  #(input %2 %1))

