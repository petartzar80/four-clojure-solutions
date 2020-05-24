(ns four-clojure-solutions.easy.27)

;; Write a function which returns true if the given sequence is a palindrome.
;; Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)

(defn palindrome [x]
  (= (apply str x) (apply str (reverse x))))
