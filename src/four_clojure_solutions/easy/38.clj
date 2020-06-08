(ns four-clojure-solutions.easy.38)

;; Write a function which takes a variable number of parameters and returns the maximum value.
;; Special restrictions: max, max-key

(defn max-val [& args]
  (last (sort args)))
