(ns four-clojure-solutions.easy.27-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.easy.27 :refer [palindrome]]))

(deftest palindrome-test
  (testing "Test #1"
    (is (false? (palindrome '(1 2 3 4 5)))))
  (testing "Test #2"
    (is (true? (palindrome "racecar"))))
  (testing "Test #3"
    (is (true? (palindrome [:foo :bar :foo]))))
  (testing "Test #4"
    (is (true? (palindrome '(1 1 3 3 1 1)))))
  (testing "Test #5"
    (is (false? (palindrome '(:a :b :c))))))
