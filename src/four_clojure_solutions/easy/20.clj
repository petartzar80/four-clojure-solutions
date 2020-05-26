(ns four-clojure-solutions.easy.20)

;; Write a function which returns the second to last element from a sequence.

(defn penultimate [x]
  (first (rest (reverse x))))
