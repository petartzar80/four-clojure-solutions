(ns four-clojure-solutions.easy.30)

;; Write a function which removes consecutive duplicates from a sequence.

(defn compress [x]
  (loop [orig x
         res []]
    (if (empty? orig)
      res
      (if (= (first orig) (first (rest orig)))
        (recur (rest orig) res)
        (recur (rest orig) (conj res (first orig)))))))

;; investigate this solution:
;; #(map first (partition-by identity %))
