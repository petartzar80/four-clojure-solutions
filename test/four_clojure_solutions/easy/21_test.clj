(ns four-clojure-solutions.easy.21-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.easy.21 :refer [nth-elem]]))

(deftest nth-elem-test
  (testing "Test #1"
    (is (= (nth-elem '(4 5 6 7) 2) 6)))
  (testing "Test #2"
    (is (= (nth-elem [:a :b :c] 0) :a)))
  (testing "Test #3"
    (is (= (nth-elem [1 2 3 4] 1) 2)))
  (testing "Test #4"
    (is (= (nth-elem '([1 2] [3 4] [5 6]) 2) [5 6]))))
