(ns four-clojure-solutions.easy.22-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.easy.22 :refer [counter]]))

(deftest counter-test
  (testing "Test #1"
    (is (= (counter '(1 2 3 3 1)) 5)))
  (testing "Test #2"
    (is (= (counter "Hello World") 11)))
  (testing "Test #3"
    (is (= (counter [[1 2] [3 4] [5 6]]) 3)))
  (testing "Test #3"
    (is (= (counter '(13)) 1)))
  (testing "Test #4"
    (is (= (counter '(:a :b :c)) 3))))
