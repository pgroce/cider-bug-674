(ns cider-bug-674.core)

(defn throw-error
  "I don't do a whole lot."
  []
  (throw (RuntimeException. "foo")))
