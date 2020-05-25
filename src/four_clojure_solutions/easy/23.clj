(ns four-clojure-solutions.easy.23)

;; Write a function which reverses a sequence.
;; Restrictions: reverse, rseq

(defn rev [x]
  (into '() x))
