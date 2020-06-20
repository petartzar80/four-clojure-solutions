(ns four-clojure-solutions.medium.44)

;; Write a function which can rotate a sequence in either direction.

(defn rotate [steps x]
  (let [seqlength (count x)
        ;; using mod, counter get steps in correspondence with direction
        counter (mod steps seqlength)]
    (concat (drop counter x) (take counter x))))
