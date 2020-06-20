(ns four-clojure-solutions.medium.43)

;; Write a function which reverses the interleave process into x number of subsequences.

(defn rev-intrlv [x y]
  (loop [sqnc x
         res []]
    (if (= y (count res))
      res
      (recur (rest sqnc) (conj res (take-nth y sqnc))))))

;; Examine this solution:
;; #(apply (partial map list) (partition %2 %1))

