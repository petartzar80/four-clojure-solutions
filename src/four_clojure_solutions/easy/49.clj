(ns four-clojure-solutions.easy.49)

;; Write a function which will split a sequence into two parts.
;; Special restrictions: split-at

(defn split-seq [x y]
  (vector (take x y) (nthrest y x)))
