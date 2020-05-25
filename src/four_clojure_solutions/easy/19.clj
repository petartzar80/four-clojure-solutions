(ns four-clojure-solutions.easy.19)

;; Write a function which returns the last element in a sequence.
;; Restrictions: last

(defn last-el [x]
  (nth x (- (count x) 1)))
