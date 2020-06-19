(ns four-clojure-solutions.medium.46-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.medium.46 :refer [flip]]))

(deftest flip-test
  (testing "Test #1"
    (is (= 3 ((flip nth) 2 [1 2 3 4 5]))))
  (testing "Test #2"
    (is (= true ((flip >) 7 8))))
  (testing "Test #2"
    (is (= 4 ((flip quot) 2 8))))
  (testing "Test #3"
    (is (= [1 2 3] ((flip take) [1 2 3 4 5] 3)))))
