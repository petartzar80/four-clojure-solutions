(ns four-clojure-solutions.easy.31)

;; Write a function which packs consecutive duplicates into sub-lists.

(defn pack [x]
  (partition-by identity x))
