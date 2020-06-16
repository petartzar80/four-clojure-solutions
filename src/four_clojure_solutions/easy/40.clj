(ns four-clojure-solutions.easy.40)

;; Write a function which separates the items of a sequence by an arbitrary value.
;; Special restrictions: interpose

(defn intrps [x y]
  (drop-last (interleave y (repeat x))))
