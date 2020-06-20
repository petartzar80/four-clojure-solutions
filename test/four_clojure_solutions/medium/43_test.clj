(ns four-clojure-solutions.medium.43-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.medium.43 :refer [rev-intrlv]]))

(deftest rev-intrlv-test
  (testing "Test #1"
    (is (= (rev-intrlv [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6)))))
  (testing "Test #2"
    (is (= (rev-intrlv (range 9) 3) '((0 3 6) (1 4 7) (2 5 8)))))
  (testing "Test #3"
    (is (= (rev-intrlv (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9))))))
