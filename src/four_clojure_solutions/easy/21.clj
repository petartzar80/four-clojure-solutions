(ns four-clojure-solutions.easy.21)

;; Write a function which returns the Nth element from a sequence.
;; Special restrictions: nth

(defn nth-elem [seq n]
  (if (= n 0)
    (first seq)
    (recur (rest seq) (dec n))))
