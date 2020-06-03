(ns four-clojure-solutions.easy.24-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.easy.24 :refer [sum-num]]))

(deftest sum-num-test
  (testing "Test #1"
    (is (= (sum-num [1 2 3]) 6)))
  (testing "Test #2"
    (is (= (sum-num (list 0 -2 5 5)) 8)))
  (testing "Test #3"
    (is (= (sum-num #{4 2 1}) 7)))
  (testing "Test #3"
    (is (= (sum-num '(0 0 -1)) -1)))
  (testing "Test #4"
    (is (= (sum-num '(1 10 3)) 14))))
