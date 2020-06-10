(ns four-clojure-solutions.easy.33-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.easy.33 :refer [replicate-var]]))

(deftest replicate-var-test
  (testing "Test #1"
    (is (= (replicate-var [1 2 3] 2) '(1 1 2 2 3 3))))
  (testing "Test #2"
    (is (= (replicate-var [:a :b] 4) '(:a :a :a :a :b :b :b :b))))
  (testing "Test #3"
    (is (= (replicate-var [4 5 6] 1) '(4 5 6))))
  (testing "Test #4"
    (is (= (replicate-var [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))))
  (testing "Test #5"
    (is (= (replicate-var [44 33] 2) [44 44 33 33]))))
